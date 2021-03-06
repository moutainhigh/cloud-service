
package com.kotak.schemas.cms_generic.reversal_response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kotak.com/schemas/CMS_Generic/Reversal_Response.xsd}Msg_Id"/&gt;
 *         &lt;element ref="{http://www.kotak.com/schemas/CMS_Generic/Reversal_Response.xsd}Status_Code"/&gt;
 *         &lt;element ref="{http://www.kotak.com/schemas/CMS_Generic/Reversal_Response.xsd}Status_Desc"/&gt;
 *         &lt;element ref="{http://www.kotak.com/schemas/CMS_Generic/Reversal_Response.xsd}UTR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgId",
    "statusCode",
    "statusDesc",
    "utr"
})
@XmlRootElement(name = "Rev_Detail")
public class RevDetail {

    @XmlElement(name = "Msg_Id", required = true)
    protected String msgId;
    @XmlElement(name = "Status_Code", required = true)
    protected String statusCode;
    @XmlElement(name = "Status_Desc", required = true)
    protected String statusDesc;
    @XmlElement(name = "UTR", nillable = true)
    protected String utr;

    /**
     * 获取msgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * 设置msgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * 获取statusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置statusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * 获取statusDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * 设置statusDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * 获取utr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTR() {
        return utr;
    }

    /**
     * 设置utr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTR(String value) {
        this.utr = value;
    }

}
