package tasks;

import models.DataExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import utils.SetDataTest;

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
