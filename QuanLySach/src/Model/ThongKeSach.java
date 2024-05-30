/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class ThongKeSach {
    private String mathongke;
    private String BookID;
    private String ngaythongke;
    private String soluongton;

    public ThongKeSach() {
    }

    public ThongKeSach(String mathongke, String BookID, String ngaythongke, String soluongton) {
        this.mathongke = mathongke;
        this.BookID = BookID;
        this.ngaythongke = ngaythongke;
        this.soluongton = soluongton;
    }

    public void setMathongke(String mathongke) {
        this.mathongke = mathongke;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public void setNgaythongke(String ngaythongke) {
        this.ngaythongke = ngaythongke;
    }

    public void setSoluongton(String soluongton) {
        this.soluongton = soluongton;
    }

    public String getMathongke() {
        return mathongke;
    }

    public String getBookID() {
        return BookID;
    }

    public String getNgaythongke() {
        return ngaythongke;
    }

    public String getSoluongton() {
        return soluongton;
    }

    @Override
    public String toString() {
        return mathongke + "," + BookID + "," + ngaythongke + "," + soluongton;
    }
    
}