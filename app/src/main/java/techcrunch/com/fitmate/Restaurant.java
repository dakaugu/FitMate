package techcrunch.com.fitmate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Restaurant {

    @SerializedName("pk")
    @Expose
    private Integer pk;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("fields")
    @Expose
    private Fields fields;

    /**
     * 
     * @return
     *     The pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * 
     * @param pk
     *     The pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * 
     * @return
     *     The model
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @return
     *     The fields
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(Fields fields) {
        this.fields = fields;
    }

}
