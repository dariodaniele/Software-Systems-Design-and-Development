package com.psss.registro.ui.docente;

import com.psss.registro.ui.segretario.view.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "docente/about", layout = DocenteMainView.class)
@PageTitle("About")
@CssImport("./styles/views/about/about-view.css")
public class AboutView extends Div {

    public AboutView() {
        setId("about-view");
        Label titolo = new Label("Registro elettronico docente");
        titolo.setClassName("text-layout");
        add(titolo);
    }

}
