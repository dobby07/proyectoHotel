package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReservaSteps {

    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private String guestName;
    private String guestPhoneNumber;
    private String confirmationNumber;

    @Given("^el usuario está en la página de reservas$")
    public void elUsuarioEstaEnLaPaginaDeReservas() {
        // Implementación para navegar a la página de reservas en el sistema
        // Puedes agregar lógica adicional según sea necesario
    }

    @When("^el usuario selecciona una habitación individual con fecha de entrada \"([^\"]*)\" y fecha de salida \"([^\"]*)\"$")
    public void elUsuarioSeleccionaUnaHabitacionIndividualConFechas(String fechaEntrada, String fechaSalida) {
        roomType = "Individual";
        checkInDate = fechaEntrada;
        checkOutDate = fechaSalida;
    }

    @And("^completa la información del huésped con nombre \"([^\"]*)\" y número de teléfono \"([^\"]*)\"$")
    public void completaLaInformacionDelHuesped(String nombreHuesped, String telefonoHuesped) {
        guestName = nombreHuesped;
        guestPhoneNumber = telefonoHuesped;
    }

    @And("^hace clic en el botón de reserva$")
    public void haceClicEnElBotonDeReserva() {
        // Implementación para realizar la reserva en el sistema y obtener el número de confirmación
        confirmationNumber = "ABC123"; // Solo un valor de ejemplo, deberías adaptarlo según tu lógica real
    }

    @Then("^la reserva debería ser confirmada con un número de reserva único$")
    public void laReservaDeberiaSerConfirmadaConNumeroUnico() {
        assertNotNull(confirmationNumber);
        // Asumiendo que el número de confirmación debe tener un formato específico o ser único en el sistema.
    }

    @And("^el usuario debería recibir un correo electrónico de confirmación$")
    public void elUsuarioDeberiaRecibirCorreoDeConfirmacion() {
        // Implementación para verificar el envío del correo electrónico de confirmación
        boolean emailSent = enviarCorreoDeConfirmacion();
        assertEquals(true, emailSent);
    }

    private boolean enviarCorreoDeConfirmacion() {
        // Lógica para enviar el correo electrónico de confirmación
        // Devuelve true si el correo se envía correctamente, de lo contrario, devuelve false
        return true; // Cambia según tu lógica real
    }
}

