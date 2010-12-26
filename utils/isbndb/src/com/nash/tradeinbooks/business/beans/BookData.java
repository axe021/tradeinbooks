//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.26 at 04:50:51 PM CST 
//


package com.nash.tradeinbooks.business.beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Title"/>
 *         &lt;element ref="{}TitleLong"/>
 *         &lt;element ref="{}AuthorsText"/>
 *         &lt;element ref="{}PublisherText"/>
 *         &lt;element ref="{}Summary"/>
 *         &lt;element ref="{}Notes"/>
 *         &lt;element ref="{}UrlsText"/>
 *         &lt;element ref="{}AwardsText"/>
 *         &lt;element ref="{}Prices"/>
 *       &lt;/sequence>
 *       &lt;attribute name="book_id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="isbn" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "titleLong",
    "authorsText",
    "publisherText",
    "summary",
    "notes",
    "urlsText",
    "awardsText",
    "prices"
})
@XmlRootElement(name = "BookData")
public class BookData {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "TitleLong", required = true)
    protected String titleLong;
    @XmlElement(name = "AuthorsText", required = true)
    protected String authorsText;
    @XmlElement(name = "PublisherText", required = true)
    protected PublisherText publisherText;
    @XmlElement(name = "Summary", required = true)
    protected String summary;
    @XmlElement(name = "Notes", required = true)
    protected String notes;
    @XmlElement(name = "UrlsText", required = true)
    protected UrlsText urlsText;
    @XmlElement(name = "AwardsText", required = true)
    protected AwardsText awardsText;
    @XmlElement(name = "Prices", required = true)
    protected Prices prices;
    @XmlAttribute(name = "book_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String bookId;
    @XmlAttribute(required = true)
    protected BigInteger isbn;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleLong() {
        return titleLong;
    }

    /**
     * Sets the value of the titleLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleLong(String value) {
        this.titleLong = value;
    }

    /**
     * Gets the value of the authorsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorsText() {
        return authorsText;
    }

    /**
     * Sets the value of the authorsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorsText(String value) {
        this.authorsText = value;
    }

    /**
     * Gets the value of the publisherText property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherText }
     *     
     */
    public PublisherText getPublisherText() {
        return publisherText;
    }

    /**
     * Sets the value of the publisherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherText }
     *     
     */
    public void setPublisherText(PublisherText value) {
        this.publisherText = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the urlsText property.
     * 
     * @return
     *     possible object is
     *     {@link UrlsText }
     *     
     */
    public UrlsText getUrlsText() {
        return urlsText;
    }

    /**
     * Sets the value of the urlsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlsText }
     *     
     */
    public void setUrlsText(UrlsText value) {
        this.urlsText = value;
    }

    /**
     * Gets the value of the awardsText property.
     * 
     * @return
     *     possible object is
     *     {@link AwardsText }
     *     
     */
    public AwardsText getAwardsText() {
        return awardsText;
    }

    /**
     * Sets the value of the awardsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardsText }
     *     
     */
    public void setAwardsText(AwardsText value) {
        this.awardsText = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link Prices }
     *     
     */
    public Prices getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prices }
     *     
     */
    public void setPrices(Prices value) {
        this.prices = value;
    }

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookId(String value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsbn(BigInteger value) {
        this.isbn = value;
    }

}
