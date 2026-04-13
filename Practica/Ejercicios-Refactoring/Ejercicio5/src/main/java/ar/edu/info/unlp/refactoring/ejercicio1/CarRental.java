package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class CarRental extends Product {
    private double cost;  /* variable ahora privada */
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod);
        this.cost = cost;
        this.company = company;
    }


    public double price() {
        return this.company.price() * this.company.promotionRate();
    }

    public double cost() {
        return this.cost;
    }

    public double getCost(){  /* nuevo metodo  */
        return this.cost;
    }
}

/* 1) La variable “cost” está declarada como pública, lo que rompe el encapsulamiento de la clase. Utilice el refactoring Encapsulate Field y
   describa brevemente los pasos llevados a cabo. Verifique que los tests provistos sigan funcionando. Discuta con un ayudante:

   A) ¿Es correcto modificar alguno de los tests para que el código refactorizado funcione?
   B) En caso de qué el test falle, ¿qué situación está representando este test?

   2) Utilice el refactoring Rename Field en el método priceFactor(), para que la variable
    “cost” se pase a llamar “quote”. Verifique que los tests provistos sigan funcionando.
    Discuta con un ayudante: ¿en este caso, es necesario modificar alguno de los tests para que el
    código refactorizado funcione?

  3) Se quiere aplicar el refactoring Pull Up Method para subir los métodos startDate() y endDate() a la superclase Product.
  ¿Es posible hacerlo en el código anterior? Justifique su respuesta basándose en las precondiciones del refactoring vistas
  en la teoría y en el libro de Refactoring de Martin Fowler.

  4) Mencione y aplique los refactorings necesarios para poder hacer Pull Up Method.

  5) Aplique Pull Up Method para subir los métodos a la superclase Product. Verifique que los tests provistos sigan funcionando.

  6) Observe los métodos price() en CarRental.java (línea 21) y en HotelStay.java (línea 25). Identifique los Code Smell presentes.
   Luego aplique los refactoring correspondientes para eliminarlos. Verifique que los tests provistos sigan funcionando

*/

/*
   1) El metodo refactoring encapsulate field se deben generar getter de la variable en cuestion, y luego cambiarla de publica a privada.
      Los test fallan porque se accedia a la variable directamente, puesto a que era publica, para que los test pasen es necesario cambiar los test, utilizando los nuevos getters

   2) No deben modificarse los test porque  se accede a la variable mediante el getter, pero debe modificarse este ultimo

   3) Para aplicar el pull up method
        i)    Asegurarse que los metodos sean identicos
        ii)   Si el selector del metodo es diferente en cada clase renombrar
        iii)  Si el metodo llama a otro que no esta en la superclase, declararlo como abstracto en la superclase
        iv)   Si el metodo llama a un atrbuto declarado en las subclases, usar "pull up field"  o "self encapsulated field"
              y declarar los getters abstractos en la superclase.
        v)    Crear un nuevo metodo en la superclase, copiar el cuerpo de uno de los metodos  a el
        vi)   Borrar el metodo de una de las subclases
        vii)  Compilar y testear
        viii) Repetir desde vi) hasta que no quede en ninguna subclase

        En este caso, primero uso pull up field para subir el atributo timePeriod a la clase product, por lo tanto debe estar en el constructor de la misma, junto con su respectivo getter
        luego hay que copiar el metodo en la clase padre, para posteriormente eliminar la variable de las subclases, junto con los metodos


   6)


 */
