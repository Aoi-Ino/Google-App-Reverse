package org.xmlpull.v1.builder.adapter;

import java.util.Iterator;
import org.xmlpull.v1.builder.XmlAttribute;
import org.xmlpull.v1.builder.XmlContainer;
import org.xmlpull.v1.builder.XmlDocument;
import org.xmlpull.v1.builder.XmlElement;
import org.xmlpull.v1.builder.XmlNamespace;

public class XmlElementAdapter implements XmlElement {
    private XmlContainer parent;
    private XmlElement target;

    public XmlElementAdapter(XmlElement xmlElement) {
        this.target = xmlElement;
        if (xmlElement.getParent() != null) {
            XmlContainer parent2 = xmlElement.getParent();
            if (parent2 instanceof XmlDocument) {
                ((XmlDocument) parent2).setDocumentElement(this);
            }
            if (parent2 instanceof XmlElement) {
                ((XmlElement) parent2).replaceChild(this, xmlElement);
            }
        }
        Iterator children = xmlElement.children();
        while (children.hasNext()) {
            fixParent(children.next());
        }
    }

    private XmlElement fixElementParent(XmlElement xmlElement) {
        xmlElement.setParent(this);
        return xmlElement;
    }

    private void fixParent(Object obj) {
        if (obj instanceof XmlElement) {
            fixElementParent((XmlElement) obj);
        }
    }

    public XmlAttribute addAttribute(String str, String str2) {
        return this.target.addAttribute(str, str2);
    }

    public void addChild(int i10, Object obj) {
        this.target.addChild(i10, obj);
        fixParent(obj);
    }

    public XmlElement addElement(String str) {
        return fixElementParent(this.target.addElement(str));
    }

    public Iterator attributes() {
        return this.target.attributes();
    }

    public Iterator children() {
        return this.target.children();
    }

    public XmlNamespace declareNamespace(String str, String str2) {
        return this.target.declareNamespace(str, str2);
    }

    public void ensureAttributeCapacity(int i10) {
        this.target.ensureAttributeCapacity(i10);
    }

    public void ensureChildrenCapacity(int i10) {
        this.target.ensureChildrenCapacity(i10);
    }

    public void ensureNamespaceDeclarationsCapacity(int i10) {
        this.target.ensureNamespaceDeclarationsCapacity(i10);
    }

    public XmlAttribute findAttribute(String str, String str2) {
        return this.target.findAttribute(str, str2);
    }

    public XmlElement findElementByName(String str) {
        return this.target.findElementByName(str);
    }

    public String getBaseUri() {
        return this.target.getBaseUri();
    }

    public String getName() {
        return this.target.getName();
    }

    public XmlNamespace getNamespace() {
        return this.target.getNamespace();
    }

    public String getNamespaceName() {
        return this.target.getNamespaceName();
    }

    public XmlContainer getParent() {
        return this.parent;
    }

    public boolean hasAttributes() {
        return this.target.hasAttributes();
    }

    public boolean hasChild(Object obj) {
        return this.target.hasChild(obj);
    }

    public boolean hasChildren() {
        return this.target.hasChildren();
    }

    public boolean hasNamespaceDeclarations() {
        return this.target.hasNamespaceDeclarations();
    }

    public void insertChild(int i10, Object obj) {
        this.target.insertChild(i10, obj);
        fixParent(obj);
    }

    public XmlNamespace lookupNamespaceByName(String str) {
        return this.target.lookupNamespaceByName(str);
    }

    public XmlNamespace lookupNamespaceByPrefix(String str) {
        return this.target.lookupNamespaceByPrefix(str);
    }

    public Iterator namespaces() {
        return this.target.namespaces();
    }

    public XmlElement newElement(String str) {
        return this.target.newElement(str);
    }

    public XmlNamespace newNamespace(String str) {
        return this.target.newNamespace(str);
    }

    public void removeAllAttributes() {
        this.target.removeAllAttributes();
    }

    public void removeAllChildren() {
        this.target.removeAllChildren();
    }

    public void removeAllNamespaceDeclarations() {
        this.target.removeAllNamespaceDeclarations();
    }

    public void removeAttribute(XmlAttribute xmlAttribute) {
        this.target.removeAttribute(xmlAttribute);
    }

    public void removeChild(Object obj) {
        this.target.removeChild(obj);
    }

    public void replaceChild(Object obj, Object obj2) {
        this.target.replaceChild(obj, obj2);
        fixParent(obj);
    }

    public void setBaseUri(String str) {
        this.target.setBaseUri(str);
    }

    public void setName(String str) {
        this.target.setName(str);
    }

    public void setNamespace(XmlNamespace xmlNamespace) {
        this.target.setNamespace(xmlNamespace);
    }

    public void setParent(XmlContainer xmlContainer) {
        this.parent = xmlContainer;
    }

    public XmlAttribute addAttribute(String str, String str2, String str3, String str4, String str5, boolean z10) {
        return this.target.addAttribute(str, str2, str3, str4, str5, z10);
    }

    public void addChild(Object obj) {
        this.target.addChild(obj);
        fixParent(obj);
    }

    public XmlElement addElement(XmlElement xmlElement) {
        return fixElementParent(this.target.addElement(xmlElement));
    }

    public XmlNamespace declareNamespace(XmlNamespace xmlNamespace) {
        return this.target.declareNamespace(xmlNamespace);
    }

    public XmlElement findElementByName(String str, String str2) {
        return this.target.findElementByName(str, str2);
    }

    public XmlElement newElement(String str, String str2) {
        return this.target.newElement(str, str2);
    }

    public XmlNamespace newNamespace(String str, String str2) {
        return this.target.newNamespace(str, str2);
    }

    public XmlAttribute addAttribute(String str, XmlNamespace xmlNamespace, String str2, String str3) {
        return this.target.addAttribute(str, xmlNamespace, str2, str3);
    }

    public XmlElement addElement(XmlNamespace xmlNamespace, String str) {
        return fixElementParent(this.target.addElement(xmlNamespace, str));
    }

    public XmlElement findElementByName(String str, String str2, XmlElement xmlElement) {
        return this.target.findElementByName(str, str2, xmlElement);
    }

    public XmlElement newElement(XmlNamespace xmlNamespace, String str) {
        return this.target.newElement(xmlNamespace, str);
    }

    public XmlAttribute addAttribute(String str, XmlNamespace xmlNamespace, String str2, String str3, boolean z10) {
        return this.target.addAttribute(str, xmlNamespace, str2, str3, z10);
    }

    public XmlElement findElementByName(String str, XmlElement xmlElement) {
        return this.target.findElementByName(str, xmlElement);
    }

    public XmlAttribute addAttribute(XmlAttribute xmlAttribute) {
        return this.target.addAttribute(xmlAttribute);
    }

    public XmlAttribute addAttribute(XmlNamespace xmlNamespace, String str, String str2) {
        return this.target.addAttribute(xmlNamespace, str, str2);
    }
}