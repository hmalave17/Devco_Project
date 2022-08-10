package co.com.Devco.certification.tasks;

import co.com.Devco.certification.models.DataExcel;
import co.com.Devco.certification.utils.SetDataTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class SetData implements Task {

    @Shared
    DataExcel dataExcel;

    @Override
    public <T extends Actor> void performAs(T actor) {
        dataExcel.setSetDeDatos(SetDataTest.dePrueba());
    }
    public static SetData user(){
        return Tasks.instrumented(SetData.class);
    }
}
