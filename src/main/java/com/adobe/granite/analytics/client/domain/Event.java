package com.adobe.granite.analytics.client.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {

})
public class Event {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected EventTypeEnum type;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(name = "default_metric", required = true, type = Boolean.class, nillable = true)
    protected Boolean defaultMetric;
    @XmlElement(required = true, nillable = true)
    protected String participation;
    @XmlElement(required = true, nillable = true)
    protected SerializationEnum serialization;
    @XmlElement(required = true, nillable = true)
    protected VisibilityEnum visibility;
    @XmlElement(required = true, nillable = true)
    protected PolarityEnum polarity;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public EventTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(EventTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the defaultMetric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultMetric() {
        return defaultMetric;
    }

    /**
     * Sets the value of the defaultMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultMetric(Boolean value) {
        this.defaultMetric = value;
    }

    /**
     * Gets the value of the participation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipation() {
        return participation;
    }

    /**
     * Sets the value of the participation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipation(String value) {
        this.participation = value;
    }

    /**
     * Gets the value of the serialization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SerializationEnum getSerialization() {
        return serialization;
    }

    /**
     * Sets the value of the serialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialization(SerializationEnum value) {
        this.serialization = value;
    }

    /**
     * Gets the value of the polarity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public PolarityEnum getPolarity() {
        return polarity;
    }

    /**
     * Sets the value of the polarity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPolarity(PolarityEnum value) {
        this.polarity = value;
    }

    /**
     * Gets the value of the visibility property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVisibility(VisibilityEnum value) {
        if (VisibilityEnum.BUILDERS_BROKEN.equals(value)) {
            this.visibility = VisibilityEnum.BUILDERS;
        } else {
            this.visibility = value;
        }
    }

}
