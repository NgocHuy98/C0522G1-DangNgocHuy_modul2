package case_study.model;

public class Contract {
    private int contractNumber;
    private int bookingCode;
    private double advanceDeposit;
    private double totalPayment;
    private String customerCode;

    public Contract() {
    }

    public Contract(int contractNumber, int bookingCode, double advanceDeposit, double totalPayment, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(double advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return
                "contractNumber = " + contractNumber +
                ", bookingCode = " + bookingCode +
                ", advanceDeposit = " + advanceDeposit +
                ", totalPayment = " + totalPayment +
                ", customerCode = " + customerCode;
    }
}
