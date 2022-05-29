package ThucHanh2;

import java.util.Date;

public class CallCard extends Student{
    private int callSlip;// Số phiếu mượn
    private Date borrowedDate;
    private Date dueDate;
    private int callNumber;//Số hiệu sách

    public CallCard(String name, int id, Date dateOfBirth, String grade, int callSlip, Date startedDate, Date dueDate, int callNumber) {
        super(name, id, dateOfBirth, grade);
        this.callSlip = callSlip;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
        this.callNumber = callNumber;
    }

    public int getCallSlip() {
        return callSlip;
    }

    public void setCallSlip(int callSlip) {
        this.callSlip = callSlip;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    @Override
    public String toString() {
        return "CallCard{" +
                "student=" + super.toString() +
                ", dueDate=" + dueDate +
                ", callNumber=" + callNumber +
                '}';
    }
}
