/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18q9;

/**
 *
 * @author Admin
 */
public class LargeMasalaPizza extends VegPizza {

    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {

        return "Masala Pizza";

    }

    @Override
    public String size() {
        return "Large Size";
    }
}
