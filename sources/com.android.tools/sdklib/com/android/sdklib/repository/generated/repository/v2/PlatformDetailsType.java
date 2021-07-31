
package com.android.sdklib.repository.generated.repository.v2;

import com.android.sdklib.repository.generated.common.v2.ApiDetailsType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * DO NOT EDIT This file was generated by xjc from sdk-repository-02.xsd. Any changes will be lost
 * upon recompilation of the schema. See the schema file for instructions on running xjc.
 *
 * <p>type-details subclass for platform components, including information on the layoutlib
 * provided.
 *
 * <p>Java class for platformDetailsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="platformDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.android.com/sdk/android/repo/common/02}apiDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="layoutlib" type="{http://schemas.android.com/sdk/android/repo/repository2/02}layoutlibType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "platformDetailsType",
        propOrder = {"layoutlib"})
@SuppressWarnings({"override", "unchecked"})
public class PlatformDetailsType extends ApiDetailsType
        implements com.android.sdklib.repository.meta.DetailsTypes.PlatformDetailsType {

    @XmlElement(required = true)
    protected com.android.sdklib.repository.generated.repository.v2.LayoutlibType layoutlib;

    /**
     * Gets the value of the layoutlib property.
     *
     * @return possible object is {@link
     *     com.android.sdklib.repository.generated.repository.v2.LayoutlibType }
     */
    public com.android.sdklib.repository.generated.repository.v2.LayoutlibType getLayoutlib() {
        return layoutlib;
    }

    /**
     * Sets the value of the layoutlib property.
     *
     * @param value allowed object is {@link
     *     com.android.sdklib.repository.generated.repository.v2.LayoutlibType }
     */
    public void setLayoutlibInternal(
            com.android.sdklib.repository.generated.repository.v2.LayoutlibType value) {
        this.layoutlib = value;
    }

    public void setLayoutlib(
            com.android.sdklib.repository.meta.DetailsTypes.PlatformDetailsType.LayoutlibType
                    value) {
        setLayoutlibInternal(
                ((com.android.sdklib.repository.generated.repository.v2.LayoutlibType) value));
    }

    public ObjectFactory createFactory() {
        return new ObjectFactory();
    }

}
