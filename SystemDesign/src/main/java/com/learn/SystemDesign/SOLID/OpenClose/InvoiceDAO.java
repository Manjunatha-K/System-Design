package com.learn.SystemDesign.SOLID.OpenClose;

//Let's assume this code has been pushed to prod but we have a new requirement for save to file functionality
// if we have added the method saveToFile in the code which is already in prod - violates the OCP
public class InvoiceDAO {

    String name;

    public InvoiceDAO() {
    }

    public InvoiceDAO(String name) {
        this.name = name;
    }

    public void savetoDB(){
        System.out.println("Save to DB ");
    }

}
