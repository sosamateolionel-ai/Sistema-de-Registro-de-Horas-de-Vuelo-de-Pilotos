//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Piloto piloto = new Piloto("LIC-48213", "Carlos Méndez");

    System.out.println("Horas iniciales: " + piloto.getHorasVuelo());

    System.out.println("\n--- Vuelos válidos ---");
    piloto.registrarVuelo(3.5);
    piloto.registrarVuelo(8.0);
    piloto.registrarVuelo(1.25);

    System.out.println("\n--- Vuelos inválidos ---");
    piloto.registrarVuelo(-4);    // intentar restar horas
    piloto.registrarVuelo(0);     // no suma nada

    System.out.println("\nTotal de horas de " + piloto.getNombre() + ": " + piloto.getHorasVuelo());

}
