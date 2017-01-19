package com.mylab.cromero.repository.dto;

/**
 * <h1>BaseRequest</h1>
 * BaseRequest dto request
 * <p>
 * <b>BaseRequest</b> BaseRequest data transfer object
 * for sevice layer
 *
 * @author Cristian Romero Matesanz
 */
public class BaseRequest {

    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        String builder = "BaseRequest [name=" +
                name +
                ", id=" +
                id +
                "]";
        return builder;
    }


}
