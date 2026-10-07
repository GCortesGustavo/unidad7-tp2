package unidad7.tp2;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = Usuario.builder()
                .id(1)
                .nombre("Juan Pérez")
                .email("juan@gmail.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2)
                .nombre("María López")
                .email("maria@gmail.com")
                .build();

        System.out.println("Usuario 1:");
        System.out.println("ID: " + usuario1.getId());
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Email: " + usuario1.getEmail());

        System.out.println();

        System.out.println("Usuario 2:");
        System.out.println("ID: " + usuario2.getId());
        System.out.println("Nombre: " + usuario2.getNombre());
        System.out.println("Email: " + usuario2.getEmail());
    }
}