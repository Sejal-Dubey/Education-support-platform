import java.time.LocalDate;

public class Donation {
    private int donationId;
    private int userId;
    private double amount;
    private LocalDate date;
    private donationCategory category; // Reference to DonationCategory interface

    public int getDonationId() {
        return this.donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public donationCategory getCategory() {
        return this.category;
    }

    public void setCategory(donationCategory category) {
        this.category = category;
    }

    
}
