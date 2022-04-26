/**
 * This class is responsible for keeping the
 * track of students fees, name ,grade & fees
 * paid.
 *
 */
public class Student {
    // Executing encapsulation
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 110000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade.
     * 
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        College.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * return the remaining fees.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's Name  : " + name + " " +
                "Total Fees paid till now Rs." + feesPaid;
    }
}