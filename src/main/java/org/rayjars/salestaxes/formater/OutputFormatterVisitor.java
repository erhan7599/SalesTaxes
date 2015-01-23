package org.rayjars.salestaxes.formater;

import org.rayjars.salestaxes.Basket;
import org.rayjars.salestaxes.Product;

public class OutputFormatterVisitor implements FormatterVisitor {

    private StringBuilder builder;

    public OutputFormatterVisitor(){
        builder = new StringBuilder();
        builder.append("OUTPUT :").append("\n");
    }

    public void visit(Integer index, Basket basket){
        builder.append("Output "+index).append(":\n");
    }

    public void visit(Basket basket){
        builder.append("Sales Taxes: ").append(basket.totalTaxes()).append("\n");
        builder.append("Total: ").append(basket.totalPriceWithTaxes()).append("\n");
    }

    public void visit(Product product){
        builder.append("1")
                .append(" ")
                .append(product.getName())
                .append(": ")
                .append(product.sellingPrice())
                .append("\n");
    }

    public String format() {
        return builder.toString();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
