package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class reserva {

    @Steps
    HomePage home;

    @Given("El usuario se encuentra en la pagina de inicio")
    public void elUsuarioSeEncuentraEnLaPaginaDeInicio() {
        home.paginaInicio();
    }
    @When("el usario ingresa el lugar de origen en donde se encuentra y al lugar a donde desea ir")
    public void elUsarioIngresaElLugarDeOrigenEnDondeSeEncuentraYAlLugarADondeDeseaIr() {
        home.lugarOrigenYDestino();
    }
    @When("Seleciona las fehcas del viaje")
    public void selecionaLasFehcasDelViaje() {
        home.reservaFechas();
    }
    @When("ingresa en la busqueda de este vuelo")
    public void ingresaEnLaBusquedaDeEsteVuelo() {
        home.buscarVuelo();
    }
    @When("el usuario busca el vuelo de menos duracion")
    public void elUsuarioBuscaElVueloDeMenosDuracion() {
        home.ordenMenorDuracion();
    }
    @Then("E usuario compra el vuelo")
    public void eUsuarioCompraElVuelo() {
        home.compraVuelo();
    }
}
