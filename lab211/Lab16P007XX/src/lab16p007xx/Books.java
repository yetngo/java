/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16p007xx;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Books {
    private int id;
    private String callno,name,author,publisher;
    private int quantity,issued;
    private Date addedDate;

    public Books() {
    }

    public Books(int id, String callno, String name, String author, String publisher, int quantity, int issued, Date addedDate) {
        this.id = id;
        this.callno = callno;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issued = issued;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCallno() {
        return callno;
    }

    public void setCallno(String callno) {
        this.callno = callno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "Books{" + "id=" + id + ", callno=" + callno + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity=" + quantity + ", issued=" + issued + ", addedDate=" + addedDate + '}';
    }
    
}