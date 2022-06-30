package com.qa.view;

import com.qa.model.InvoiceHeader;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class InvFrame extends JFrame {
    public SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private  ArrayList<InvoiceHeader> Invoices= new ArrayList<>();

}

