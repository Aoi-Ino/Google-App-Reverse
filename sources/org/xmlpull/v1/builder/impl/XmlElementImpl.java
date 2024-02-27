package org.xmlpull.v1.builder.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.builder.XmlAttribute;
import org.xmlpull.v1.builder.XmlBuilderException;
import org.xmlpull.v1.builder.XmlContainer;
import org.xmlpull.v1.builder.XmlDocument;
import org.xmlpull.v1.builder.XmlElement;
import org.xmlpull.v1.builder.XmlNamespace;

public class XmlElementImpl implements XmlElement {
    private static final Iterator EMPTY_ITERATOR = new EmptyIterator((AnonymousClass1) null);
    private List attrs;
    private List children;
    private String name;
    private XmlNamespace namespace;
    private List nsList;
    private XmlContainer parent;

    /* renamed from: org.xmlpull.v1.builder.impl.XmlElementImpl$1  reason: invalid class name */
    class AnonymousClass1 {
    }

    private static class EmptyIterator implements Iterator {
        private EmptyIterator() {
        }

        /* synthetic */ EmptyIterator(AnonymousClass1 r12) {
            this();
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new RuntimeException("this iterator has no content and next() is not allowed");
        }

        public void remove() {
            throw new RuntimeException("this iterator has no content and remove() is not allowed");
        }
    }

    XmlElementImpl(String str, String str2) {
        if (str != null) {
            this.namespace = new XmlNamespaceImpl((String) null, str);
        }
        this.name = str2;
    }

    private void checkChildParent(Object obj) {
        if (!(obj instanceof XmlContainer)) {
            return;
        }
        if (obj instanceof XmlElement) {
            XmlContainer parent2 = ((XmlElement) obj).getParent();
            if (parent2 != null && parent2 != this.parent) {
                throw new XmlBuilderException("child must have no parent to be added to this node");
            }
        } else if (obj instanceof XmlDocument) {
            throw new XmlBuilderException("docuemet can not be stored as element child");
        }
    }

    private void setChildParent(Object obj) {
        if (obj instanceof XmlElement) {
            ((XmlElement) obj).setParent(this);
        }
    }

    public XmlAttribute addAttribute(String str, String str2) {
        return addAttribute("CDATA", (XmlNamespace) null, str, str2, false);
    }

    public void addChild(int i10, Object obj) {
        if (this.children == null) {
            ensureChildrenCapacity(1);
        }
        checkChildParent(obj);
        this.children.add(i10, obj);
        setChildParent(obj);
    }

    public XmlElement addElement(String str) {
        return addElement((XmlNamespace) null, str);
    }

    public Iterator attributes() {
        List list = this.attrs;
        return list == null ? EMPTY_ITERATOR : list.iterator();
    }

    public Iterator children() {
        List list = this.children;
        return list == null ? EMPTY_ITERATOR : list.iterator();
    }

    public XmlNamespace declareNamespace(String str, String str2) {
        if (str != null) {
            return declareNamespace(newNamespace(str, str2));
        }
        throw new XmlBuilderException("namespace added to element must have not null prefix");
    }

    public void ensureAttributeCapacity(int i10) {
        List list = this.attrs;
        if (list == null) {
            this.attrs = new ArrayList(i10);
        } else {
            ((ArrayList) list).ensureCapacity(i10);
        }
    }

    public void ensureChildrenCapacity(int i10) {
        List list = this.children;
        if (list == null) {
            this.children = new ArrayList(i10);
        } else {
            ((ArrayList) list).ensureCapacity(i10);
        }
    }

    public void ensureNamespaceDeclarationsCapacity(int i10) {
        List list = this.nsList;
        if (list == null) {
            this.nsList = new ArrayList(i10);
        } else {
            ((ArrayList) list).ensureCapacity(i10);
        }
    }

    public XmlAttribute findAttribute(String str, String str2) {
        if (str2 != null) {
            List list = this.attrs;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                XmlAttribute xmlAttribute = (XmlAttribute) this.attrs.get(i10);
                String name2 = xmlAttribute.getName();
                if (name2 == str2 || str2.equals(name2)) {
                    if (str != null) {
                        String namespaceName = xmlAttribute.getNamespaceName();
                        if (str.equals(namespaceName)) {
                            return xmlAttribute;
                        }
                        if (str == "" && namespaceName == null) {
                            return xmlAttribute;
                        }
                    } else if (xmlAttribute.getNamespace() == null || xmlAttribute.getNamespace().getNamespaceName() == "") {
                        return xmlAttribute;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("attribute name ca not ber null");
    }

    public XmlElement findElementByName(String str) {
        List list = this.children;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = this.children.get(i10);
            if (obj instanceof XmlElement) {
                XmlElement xmlElement = (XmlElement) obj;
                if (str.equals(xmlElement.getName())) {
                    return xmlElement;
                }
            }
        }
        return null;
    }

    public String getBaseUri() {
        throw new XmlBuilderException("not implemented");
    }

    public String getName() {
        return this.name;
    }

    public XmlNamespace getNamespace() {
        return this.namespace;
    }

    public String getNamespaceName() {
        XmlNamespace xmlNamespace = this.namespace;
        if (xmlNamespace != null) {
            return xmlNamespace.getNamespaceName();
        }
        return null;
    }

    public XmlContainer getParent() {
        return this.parent;
    }

    public boolean hasAttributes() {
        List list = this.attrs;
        return list != null && list.size() > 0;
    }

    public boolean hasChild(Object obj) {
        if (this.children == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.children.size(); i10++) {
            if (this.children.get(i10) == obj) {
                return true;
            }
        }
        return false;
    }

    public boolean hasChildren() {
        List list = this.children;
        return list != null && list.size() > 0;
    }

    public boolean hasNamespaceDeclarations() {
        List list = this.nsList;
        return list != null && list.size() > 0;
    }

    public void insertChild(int i10, Object obj) {
        this.children.set(i10, obj);
    }

    public XmlNamespace lookupNamespaceByName(String str) {
        if (str == null) {
            throw new IllegalArgumentException("namespace name can not ber null");
        } else if (!hasNamespaceDeclarations()) {
            return null;
        } else {
            int size = this.nsList.size();
            for (int i10 = 0; i10 < size; i10++) {
                XmlNamespace xmlNamespace = (XmlNamespace) this.nsList.get(i10);
                if (str.equals(xmlNamespace.getNamespaceName())) {
                    return xmlNamespace;
                }
            }
            return null;
        }
    }

    public XmlNamespace lookupNamespaceByPrefix(String str) {
        if (str == null) {
            throw new IllegalArgumentException("namespace prefix can not ber null");
        } else if (!hasNamespaceDeclarations()) {
            return null;
        } else {
            int size = this.nsList.size();
            for (int i10 = 0; i10 < size; i10++) {
                XmlNamespace xmlNamespace = (XmlNamespace) this.nsList.get(i10);
                if (str.equals(xmlNamespace.getPrefix())) {
                    return xmlNamespace;
                }
            }
            return null;
        }
    }

    public Iterator namespaces() {
        List list = this.nsList;
        return list == null ? EMPTY_ITERATOR : list.iterator();
    }

    public XmlElement newElement(String str) {
        return newElement((XmlNamespace) null, str);
    }

    public XmlNamespace newNamespace(String str) {
        return newNamespace((String) null, str);
    }

    public void removeAllAttributes() {
        this.attrs = null;
    }

    public void removeAllChildren() {
        this.children = null;
    }

    public void removeAllNamespaceDeclarations() {
        this.nsList = null;
    }

    public void removeAttribute(XmlAttribute xmlAttribute) {
        for (int i10 = 0; i10 < this.attrs.size(); i10++) {
            if (this.attrs.get(i10).equals(xmlAttribute)) {
                this.attrs.remove(i10);
                return;
            }
        }
    }

    public void removeChild(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("child to remove can not be null");
        } else if (hasChildren()) {
            int indexOf = this.children.indexOf(obj);
            if (indexOf != -1) {
                this.children.remove(indexOf);
            }
        } else {
            throw new XmlBuilderException("no children to remove");
        }
    }

    public void replaceChild(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException("new child to replace can not be null");
        } else if (obj2 == null) {
            throw new IllegalArgumentException("old child to replace can not be null");
        } else if (hasChildren()) {
            int indexOf = this.children.indexOf(obj2);
            if (indexOf != -1) {
                this.children.set(indexOf, obj);
                return;
            }
            throw new XmlBuilderException("could not find child to replace");
        } else {
            throw new XmlBuilderException("no children available for replacement");
        }
    }

    public void setBaseUri(String str) {
        throw new XmlBuilderException("not implemented");
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNamespace(XmlNamespace xmlNamespace) {
        this.namespace = xmlNamespace;
    }

    public void setParent(XmlContainer xmlContainer) {
        if (xmlContainer != null) {
            if (xmlContainer instanceof XmlElement) {
                Iterator children2 = ((XmlElement) xmlContainer).children();
                while (children2.hasNext()) {
                    if (children2.next() == this) {
                    }
                }
                throw new XmlBuilderException("this element must be child of parent to set its parent");
            } else if ((xmlContainer instanceof XmlDocument) && ((XmlDocument) xmlContainer).getDocumentElement() != this) {
                throw new XmlBuilderException("this element must be root docuemnt element to have document set as parent but already different element is set as root document element");
            }
        }
        this.parent = xmlContainer;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("name[");
        stringBuffer.append(this.name);
        stringBuffer.append("] namespace[");
        stringBuffer.append(this.namespace.getNamespaceName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    XmlElementImpl(XmlNamespace xmlNamespace, String str) {
        this.namespace = xmlNamespace;
        this.name = str;
    }

    public XmlAttribute addAttribute(String str, String str2, String str3, String str4, String str5, boolean z10) {
        return addAttribute(str, newNamespace(str2, str3), str4, str5, z10);
    }

    public void addChild(Object obj) {
        if (this.children == null) {
            ensureChildrenCapacity(1);
        }
        checkChildParent(obj);
        this.children.add(obj);
        setChildParent(obj);
    }

    public XmlElement addElement(XmlElement xmlElement) {
        addChild(xmlElement);
        return xmlElement;
    }

    public XmlNamespace declareNamespace(XmlNamespace xmlNamespace) {
        if (xmlNamespace.getPrefix() != null) {
            if (this.nsList == null) {
                ensureNamespaceDeclarationsCapacity(5);
            }
            this.nsList.add(xmlNamespace);
            return xmlNamespace;
        }
        throw new XmlBuilderException("namespace added to element must have not null prefix");
    }

    public XmlElement findElementByName(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public XmlElement newElement(String str, String str2) {
        return new XmlElementImpl(str, str2);
    }

    public XmlNamespace newNamespace(String str, String str2) {
        return new XmlNamespaceImpl(str, str2);
    }

    public XmlAttribute addAttribute(String str, XmlNamespace xmlNamespace, String str2, String str3) {
        return addAttribute(str, xmlNamespace, str2, str3, false);
    }

    public XmlElement addElement(XmlNamespace xmlNamespace, String str) {
        XmlElement newElement = newElement(xmlNamespace, str);
        addChild(newElement);
        return newElement;
    }

    public XmlElement findElementByName(String str, String str2, XmlElement xmlElement) {
        throw new UnsupportedOperationException();
    }

    public XmlElement newElement(XmlNamespace xmlNamespace, String str) {
        return new XmlElementImpl(xmlNamespace, str);
    }

    public XmlAttribute addAttribute(String str, XmlNamespace xmlNamespace, String str2, String str3, boolean z10) {
        return addAttribute(new XmlAttributeImpl(this, str, xmlNamespace, str2, str3, z10));
    }

    public XmlElement findElementByName(String str, XmlElement xmlElement) {
        throw new UnsupportedOperationException();
    }

    public XmlAttribute addAttribute(XmlAttribute xmlAttribute) {
        if (this.attrs == null) {
            ensureAttributeCapacity(5);
        }
        this.attrs.add(xmlAttribute);
        return xmlAttribute;
    }

    public XmlAttribute addAttribute(XmlNamespace xmlNamespace, String str, String str2) {
        return addAttribute("CDATA", xmlNamespace, str, str2, false);
    }
}