/*
 * An XML document type.
 * Localname: ExecuteResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * A document containing one ExecuteResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public interface ExecuteResponseMsgDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExecuteResponseMsgDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEACC53AB4DE4AB80D192E3C9B6CE210A").resolveHandle("executeresponsemsg5adbdoctype");
    
    /**
     * Gets the "ExecuteResponseMsg" element
     */
    com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg getExecuteResponseMsg();
    
    /**
     * Sets the "ExecuteResponseMsg" element
     */
    void setExecuteResponseMsg(com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg executeResponseMsg);
    
    /**
     * Appends and returns a new empty "ExecuteResponseMsg" element
     */
    com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg addNewExecuteResponseMsg();
    
    /**
     * An XML ExecuteResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface ExecuteResponseMsg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExecuteResponseMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEACC53AB4DE4AB80D192E3C9B6CE210A").resolveHandle("executeresponsemsg59e2elemtype");
        
        /**
         * Gets the "OverallStatus" element
         */
        java.lang.String getOverallStatus();
        
        /**
         * Gets (as xml) the "OverallStatus" element
         */
        org.apache.xmlbeans.XmlString xgetOverallStatus();
        
        /**
         * Sets the "OverallStatus" element
         */
        void setOverallStatus(java.lang.String overallStatus);
        
        /**
         * Sets (as xml) the "OverallStatus" element
         */
        void xsetOverallStatus(org.apache.xmlbeans.XmlString overallStatus);
        
        /**
         * Gets the "RequestID" element
         */
        java.lang.String getRequestID();
        
        /**
         * Gets (as xml) the "RequestID" element
         */
        org.apache.xmlbeans.XmlString xgetRequestID();
        
        /**
         * True if has "RequestID" element
         */
        boolean isSetRequestID();
        
        /**
         * Sets the "RequestID" element
         */
        void setRequestID(java.lang.String requestID);
        
        /**
         * Sets (as xml) the "RequestID" element
         */
        void xsetRequestID(org.apache.xmlbeans.XmlString requestID);
        
        /**
         * Unsets the "RequestID" element
         */
        void unsetRequestID();
        
        /**
         * Gets array of all "Results" elements
         */
        com.exacttarget.wsdl.partnerapi.ExecuteResponse[] getResultsArray();
        
        /**
         * Gets ith "Results" element
         */
        com.exacttarget.wsdl.partnerapi.ExecuteResponse getResultsArray(int i);
        
        /**
         * Returns number of "Results" element
         */
        int sizeOfResultsArray();
        
        /**
         * Sets array of all "Results" element
         */
        void setResultsArray(com.exacttarget.wsdl.partnerapi.ExecuteResponse[] resultsArray);
        
        /**
         * Sets ith "Results" element
         */
        void setResultsArray(int i, com.exacttarget.wsdl.partnerapi.ExecuteResponse results);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Results" element
         */
        com.exacttarget.wsdl.partnerapi.ExecuteResponse insertNewResults(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Results" element
         */
        com.exacttarget.wsdl.partnerapi.ExecuteResponse addNewResults();
        
        /**
         * Removes the ith "Results" element
         */
        void removeResults(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
