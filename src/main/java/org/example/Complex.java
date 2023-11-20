package org.example;
//Веремеенко Даниил ИС-3
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Complex {
    private int x;
    private int y;
    private double chislo;
    private double chislo1;

    public Complex(double chislo, double chislo1) {
        this.chislo = chislo;
        this.chislo1 = chislo1;
    }

    public Complex add(Complex other) {
        double summach = chislo + other.chislo;
        double summach1 = chislo1 + other.chislo1;
        return new Complex(summach, summach1);
    }
    public Complex sub(Complex other) {
        double summa2ch = chislo - other.chislo;
        double summa2ch1 = chislo1 - other.chislo1;
        return new Complex(summa2ch, summa2ch1);
    }

    public Complex mul(Complex other) {
        double mulch = (chislo * other.chislo) - (chislo1 * other.chislo1);
        double mulch1 = (chislo * other.chislo1) + (chislo1 * other.chislo);
        return new Complex(mulch, mulch1);
    }
    public Complex div(Complex other) {
        double divch = (chislo / other.chislo) - (chislo1 / other.chislo1);
        double divch1 = (chislo / other.chislo1) + (chislo1 / other.chislo);
        return new Complex(divch, divch1);
    }

    public double getModulus() {
        return Math.sqrt(chislo * chislo + chislo1 * chislo1);
    }

    public boolean isEqual(Complex other) {
        return (this.chislo == other.chislo) && (this.chislo1 == other.chislo1);
    }
    @Override
    public String toString() {
        return chislo + " + " + chislo1 + "i";
    }
}
