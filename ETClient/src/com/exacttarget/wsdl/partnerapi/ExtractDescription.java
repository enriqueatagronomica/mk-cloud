/*
 * XML Type:  ExtractDescription
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractDescription
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ExtractDescription(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ExtractDescription extends com.exacttarget.wsdl.partnerapi.ExtractTemplate
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtractDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEACC53AB4DE4AB80D192E3C9B6CE210A").resolveHandle("extractdescription00fbtype");
    
    /**
     * Gets the "Parameters" element
     */
    com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters getParameters();
    
    /**
     * True if has "Parameters" element
     */
    boolean isSetParameters();
    
    /**
     * Sets the "Parameters" element
     */
    void setParameters(com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters parameters);
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters addNewParameters();
    
    /**
     * Unsets the "Parameters" element
     */
    void unsetParameters();
    
    /**
     * An XML Parameters(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Parameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEACC53AB4DE4AB80D192E3C9B6CE210A").resolveHandle("parametersdca1elemtype");
        
        /**
         * Gets array of all "Parameter" elements
         */
        com.exacttarget.wsdl.partnerapi.ExtractParameterDescription[] getParameterArray();
        
        /**
         * Gets ith "Parameter" element
         */
        com.exacttarget.wsdl.partnerapi.ExtractParameterDescription getParameterArray(int i);
        
        /**
         * Returns number of "Parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "Parameter" element
         */
        void setParameterArray(com.exacttarget.wsdl.partnerapi.ExtractParameterDescription[] parameterArray);
        
        /**
         * Sets ith "Parameter" element
         */
        void setParameterArray(int i, com.exacttarget.wsdl.partnerapi.ExtractParameterDescription parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        com.exacttarget.wsdl.partnerapi.ExtractParameterDescription insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        com.exacttarget.wsdl.partnerapi.ExtractParameterDescription addNewParameter();
        
        /**
         * Removes the ith "Parameter" element
         */
        void removeParameter(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ExtractDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ExtractDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
