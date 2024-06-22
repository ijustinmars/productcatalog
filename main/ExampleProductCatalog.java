package org.productcatalog.main;

import org.productcatalog.model.*;

import java.util.Date;

public class ExampleProductCatalog {
    public static void main(String[] args) {

        IProduct[] products = new IProduct[6];

        products[0] = new IPhone("Apple", "14", "blanco", 3000);
        products[1] = new TvLcd("LG", 32, 2850);
        products[2] = new Book(new Date(1605), "Miguel de Cervantes", "Don Quijote de la Manhca", "Book Trade", 100);
        products[3] = new Book(new Date(1617),"Lope de Vega", "Fuenteovejuna", "Pluton Ediciones", 45);
        products[4] = new Comics(new Date(), "Brian Michael Bendis", "Avengers vs X-Men",  "Marvel", "Bruja Escarlata", 325);
        products[5] = new IPhone("Apple", "12", "negro", 1560);

        for (IProduct product:products){
            System.out.println("\nTipo de producto: " + product.getClass().getSimpleName() +
                    "\nPrecio: Q." + product.getPrice() +
                    "\nPrecio de venta: Q." + product.getSalePrice());

            if (product instanceof IElectronic){
                System.out.println("Fabricante: " + ((IElectronic) product).getMaker());
            }

            if (product instanceof IPhone){
                System.out.println("Modelo: " + ((IPhone) product).getModel() +
                        "\nColor: " + ((IPhone) product).getColor());
            }

            if (product instanceof TvLcd){
                System.out.println("Pulgadas: " + ((TvLcd) product).getInches());
            }

            if (product instanceof Book){
                System.out.println("Fecha de publicacion: " + ((Book) product).getPublicationDate() +
                        "\nAutor: " + ((Book) product).getAuthor() +
                        "\nTitulo: " + ((Book) product).getTitle() +
                        "\nEditorial: " + ((Book) product).getEditorial());
            }

            if (product instanceof Comics){
                System.out.println("Personaje principal: " + ((Comics) product).getCharacter());
            }
        }

    }
}