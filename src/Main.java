import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Objeto string en literal vs operador new
        String hola = "Hola, gracias por la informacion";
        String hola3 = "Hola, gracias por la informacion";
        String hola1 = new String ("Hola, gracias por la informacion");

        System.out.println(hola);
        System.out.println(hola3);
        System.out.println(hola1);

        //Inmutabilidad
        String saludo = "Hola, gracias por la informacion";
        String nombre = "Abraham";
        String nombre1 = "Abraham";
        String saludoPersonalizado = saludo + " querido " + nombre;
        String saludoPersonalizado2 = saludo.concat("querido").concat(nombre);

        System.out.println(saludoPersonalizado);
        System.out.println(saludoPersonalizado2);

        saludo = saludo.transform(s-> { return s+"querido "+nombre; });
        System.out.println(saludo);

        nombre1 = nombre1.replace("a", "A");
        System.out.println(nombre1);

        //Metodos importantes del objeto string
        String name = "Abraham";

        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.equals("Abraham"));
        System.out.println(name.equalsIgnoreCase("Abraham"));
        System.out.println(name.compareTo("Andres"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.compareToIgnoreCase("Andres"));
        System.out.println(name.replace("A", "."));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.indexOf("m"));
        System.out.println(name.startsWith("bra"));
        System.out.println(name.startsWith("abr"));
        System.out.println(name.contains("x"));
        System.out.println(name.trim());

        //Obtener la extencion de un archivo
        String archivo = "imagen_generica.png";
        int i = archivo.lastIndexOf(".");
        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));
    }
}