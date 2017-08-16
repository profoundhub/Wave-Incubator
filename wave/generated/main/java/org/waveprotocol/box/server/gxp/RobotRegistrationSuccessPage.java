// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L29, C42
import com.google.gxp.html.*;                                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L29, C42
import com.google.gxp.js.*;                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L29, C42
import com.google.gxp.text.*;                                                   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L29, C42

public class RobotRegistrationSuccessPage extends com.google.gxp.base.GxpTemplate {   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L29, C42

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String token, final String tokenSecret, final String analyticsAccount)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L35, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L37, C3
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L37, C3
    }
    gxp$out.append(">\n<title>Robot Successfully Registered</title>\n<link rel=\"shortcut icon\" href=\"/static/favicon.ico\"");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L37, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L39, C3
      gxp$out.append(" /");                                                     // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L39, C3
    }
    gxp$out.append(">\n");                                                      // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L39, C3
    org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, analyticsAccount, org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError());   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L40, C3
    gxp$out.append("</head>\n<body>Your Robot has been successfully registered. Please take note of the consumer\ntoken and token secret to use for the Active API.\n<table><tr><td><b>Consumer Token</b></td>\n<td>");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L36, C3
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (token));   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L50, C11
    gxp$out.append("</td></tr>\n<tr><td><b>Consumer Token Secret</b></td>\n<td>");   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L50, C7
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (tokenSecret));   // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L54, C11
    gxp$out.append("</td></tr></table></body></html>");                         // C:\wave\incubator-wave\wave\src\main\gxp\org\waveprotocol\box\server\gxp\RobotRegistrationSuccessPage.gxp: L54, C7
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("token", "tokenSecret", "analyticsAccount"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String token, final String tokenSecret, final String analyticsAccount) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.RobotRegistrationSuccessPage.write(gxp$out, gxp_context, token, tokenSecret, analyticsAccount);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String token, final String tokenSecret, final String analyticsAccount)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String token, final String tokenSecret, final String analyticsAccount);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String token, final String tokenSecret, final String analyticsAccount)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.RobotRegistrationSuccessPage.write(gxp$out, gxp_context, token, tokenSecret, analyticsAccount);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String token, final String tokenSecret, final String analyticsAccount) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, token, tokenSecret, analyticsAccount);
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
