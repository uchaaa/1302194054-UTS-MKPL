package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Child, DataEmployee {

	private LocalDate dateJoined;
	private int monthWorkingInYear;

	private List<Child> child;

	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	public Employee(DataEmployee staff, LocalDate dateJoined) {
		this.setEmployeeId(DataEmployee.getEmployeeId());
		this.setFirstName(DataEmployee.getFirstName());
		this.setLastName(DataEmployee.getLastName());
		this.setIdNumber(DataEmployee.getIdNumber());
		this.setAddress(DataEmployee.getAddress());
		this.dateJoined = dateJoined;
		this.setForeigner(DataEmployee.isForeigner());
		this.setGender(DataEmployee.getGender());

		child = new LinkedList<Child>();
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void addChild(String childName, String childIdNumber) {
		child.add(new Child(childName, childIdNumber))
	}

	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumber.size());
	}
}
