/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class ReaderManaging {
    private String ReaderID;
    private String ReaderName;
    private String ReaderAddress;
    private String ReaderPhone;
    private String ReaderEmail;

    public ReaderManaging() {
    }


    public ReaderManaging(String ReaderID, String ReaderName, String ReaderAddress, String ReaderPhone, String ReaderEmail) {
        this.ReaderID = ReaderID;
        this.ReaderName = ReaderName;
        this.ReaderAddress = ReaderAddress;
        this.ReaderPhone = ReaderPhone;
        this.ReaderEmail = ReaderEmail;
    }

    public String getReaderID() {
        return ReaderID;
    }

    public void setReaderID(String ReaderID) {
        this.ReaderID = ReaderID;
    }

    public String getReaderName() {
        return ReaderName;
    }

    public void setReaderName(String ReaderName) {
        this.ReaderName = ReaderName;
    }

    public String getReaderAddress() {
        return ReaderAddress;
    }

    public void setReaderAddress(String ReaderAddress) {
        this.ReaderAddress = ReaderAddress;
    }

    public String getReaderPhone() {
        return ReaderPhone;
    }

    public void setReaderPhone(String ReaderPhone) {
        this.ReaderPhone = ReaderPhone;
    }

    public String getReaderEmail() {
        return ReaderEmail;
    }

    public void setReaderEmail(String ReaderEmail) {
        this.ReaderEmail = ReaderEmail;
    }

    @Override
    public String toString() {
        return  ReaderID +","+ ReaderName +","+ ReaderAddress +","+ ReaderPhone +","+ ReaderEmail;
    }
    
}
