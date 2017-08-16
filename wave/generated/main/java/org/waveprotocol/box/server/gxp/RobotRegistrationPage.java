// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L29, C44
import com.google.gxp.html.*;                                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L29, C44
import com.google.gxp.js.*;                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L29, C44
import com.google.gxp.text.*;                                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L29, C44

public class RobotRegistrationPage extends com.google.gxp.base.GxpTemplate {    // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L29, C44

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String analyticsAccount)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L35, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L37, C7
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L37, C7
    }
    gxp$out.append(">\n<title>Robot Registration</title>\n<link rel=\"shortcut icon\" href=\"/static/favicon.ico\"");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L37, C7
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L39, C7
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L39, C7
    }
    gxp$out.append(">\n");                                                      // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L39, C7
    org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, analyticsAccount, org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError());   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L40, C7
    gxp$out.append("</head>\n<body>");                                          // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L36, C5
    if (!message.isEmpty()) {                                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L45, C7
      gxp$out.append("<b>");                                                    // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L46, C9
      com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (message));   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L46, C12
      gxp$out.append("</b>");                                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L46, C9
    }
    gxp$out.append("\n<form method=\"post\" action=\"\">Robot Username: <input name=\"username\" type=\"text\"");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L47, C16
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C25
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C25
    }
    gxp$out.append(">@");                                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C25
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C62
    gxp$out.append("<br");                                                      // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C87
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C87
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C87
    }
    gxp$out.append(">\nRobot URL: <input name=\"location\" type=\"text\"");     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L50, C87
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L51, C20
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L51, C20
    }
    gxp$out.append("><br");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L51, C20
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L51, C56
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L51, C56
    }
    gxp$out.append(">\n<input type=\"submit\"");                                // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L51, C56
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L52, C9
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L52, C9
    }
    gxp$out.append("></form></body></html>");                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationPage.gxp: L52, C9
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("domain", "message", "analyticsAccount"));

  /**
   * @return the names of the user defined arguments to this template.
   * This is sort of like a mapping between the positional and named
   * parameters. The first two parameters (common to all templates) are
   * not included in this list. (BTW: No, Java reflection does not
   * provide this information)
   */
  public static java.util.List<String> getArgList() {
    return GXP$ARGLIST;
  }

  private abstract static class TunnelingHtmlClosure
      extends GxpTemplate.TunnelingGxpClosure
      implements com.google.gxp.html.HtmlClosure {
  }

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String analyticsAccount) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.RobotRegistrationPage.write(gxp$out, gxp_context, domain, message, analyticsAccount);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String analyticsAccount)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String analyticsAccount);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String analyticsAccount)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.RobotRegistrationPage.write(gxp$out, gxp_context, domain, message, analyticsAccount);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String analyticsAccount) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, domain, message, analyticsAccount);
        }
      };
    }
  }
}

// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
