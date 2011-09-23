package com.serjann.force.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Mech {

    @NotNull
    @Size(min = 3, max = 50)
    private String dessc1;

    @NotNull
    @Size(min = 3, max = 50)
    private String dessc2;
}
