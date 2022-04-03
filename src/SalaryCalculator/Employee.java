package SalaryCalculator;

public class Employee {
    String name;
    int salary, workHours, hireYear;
    double tax, salaryIncrease;
    int bonus;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            this.tax = 0.0;
        } else {
            this.tax = this.salary * 0.03;
        }
        return this.tax;
    }

    int bonus() {
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        return this.bonus;
    }

    double raiseSalary() {
        int workingYear=2021-this.hireYear;
        if(workingYear<10) {
            salaryIncrease =salary*0.05;
        } else if(workingYear>9 && workingYear<20) {
            salaryIncrease =salary*0.1;
        } else {
            salaryIncrease =salary*0.15;
        }
        return salaryIncrease;
    }

    void print() {
        System.out.println("Adı : " + this.name + "\n"
                + "Maaşı : " + this.salary + "\n"
                + "Çalışma Saati : " + this.workHours + "\n"
                + "Başlangiç Yılı : " + this.hireYear + "\n"
                + "Vergi : " + tax() + "\n"
                + "Bonus : " + bonus() + "\n"
                + "Maaş Artışı : " + raiseSalary() + "\n"
                + "Vergi ve Bonuslar ile birlikte maaş : " + (salary+bonus-tax) + "\n"
                + "Toplam Maaş : " + (salary+salaryIncrease) +"\n"
        );
    }

}
