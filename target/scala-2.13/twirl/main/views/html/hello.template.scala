
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,LinkedHashMap[String, Float],HomeController,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*The first (...) is a form of an import Makes the name parameter accessible within the following functions*/
  def apply/*3.2*/(name: String, scores: LinkedHashMap[String, Float], control: HomeController)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*29.2*/tableRow/*29.10*/(entry: (String, Float)):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*29.38*/("""
    """),format.raw/*30.5*/("""<tr>
        <td>"""),_display_(/*31.14*/entry/*31.19*/.toString().split(",")/*31.41*/(0)/*31.44*/.substring(1)),format.raw/*31.57*/("""</td>
        <td>"""),_display_(/*32.14*/percentFormat(
                Float.parseFloat(
                    entry.toString().split(",")(1)
                        .substring(0, entry.toString().split(",")(1).length() - 1)
                )
            )),format.raw/*37.14*/("""
        """),format.raw/*38.9*/("""</td>
    </tr>
""")))};def /*42.2*/fullTable/*42.11*/(map: LinkedHashMap[String, Float]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*42.50*/("""
        """),format.raw/*43.9*/("""<tr>
            <th>Name</th>
            <th>Score</th>
        </tr>
        """),_display_(/*47.10*/for(entry <- map) yield /*47.27*/ {_display_(Seq[Any](format.raw/*47.29*/("""
            """),_display_(/*48.14*/tableRow(entry)),format.raw/*48.29*/("""
        """)))}),format.raw/*49.10*/("""
""")))};def /*55.2*/percentFormat/*55.15*/(perc: Float) = {{
    (perc * 100.0f).toString() ++ "%";
}};
Seq[Any](format.raw/*3.116*/("""

"""),_display_(/*5.2*/main("Hello")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/(""" """),format.raw/*5.75*/("""
    """),format.raw/*6.5*/("""<section id="top">
        <div class="wrapper">
            <h1>Hello """),_display_(/*8.24*/name),format.raw/*8.28*/("""!</h1>
        </div>
    </section>
    <div id="custom-demo">
        <table>
            <caption>Unsorted</caption>
            """),_display_(/*14.14*/fullTable(scores)),format.raw/*14.31*/("""
        """),format.raw/*15.9*/("""</table>
        <table>
            <caption>Sorted by Value</caption>
            """),_display_(/*18.14*/fullTable(controllers.HomeController.sortByValue(scores))),format.raw/*18.71*/("""
        """),format.raw/*19.9*/("""</table>
        <table>
            <caption>Sorted by Key</caption>
            """),_display_(/*22.14*/fullTable(controllers.HomeController.sortByKey(scores))),format.raw/*22.69*/("""
        """),format.raw/*23.9*/("""</table>
    </div>
""")))}),format.raw/*25.2*/("""
"""),format.raw/*28.3*/("""
"""),format.raw/*40.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*54.3*/("""
"""))
      }
    }
  }

  def render(name:String,scores:LinkedHashMap[String, Float],control:HomeController,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(name,scores,control)(assetsFinder)

  def f:((String,LinkedHashMap[String, Float],HomeController) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (name,scores,control) => (assetsFinder) => apply(name,scores,control)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/hello.scala.html
                  HASH: cd93be9c4688b2ac0f674be3100486ccdad6ca94
                  MATRIX: 1069->199|1262->1033|1279->1041|1384->1069|1417->1075|1463->1094|1477->1099|1508->1121|1520->1124|1554->1137|1601->1157|1841->1376|1878->1386|1920->1410|1938->1419|2054->1458|2091->1468|2203->1553|2236->1570|2276->1572|2318->1587|2354->1602|2396->1613|2422->1672|2444->1685|2536->313|2566->318|2587->331|2626->333|2654->391|2686->397|2786->471|2810->475|2976->614|3014->631|3051->641|3166->729|3244->786|3281->796|3394->882|3470->937|3507->947|3560->970|3589->1030|3618->1405|3649->1616|3680->1669
                  LINES: 27->3|31->29|31->29|33->29|34->30|35->31|35->31|35->31|35->31|35->31|36->32|41->37|42->38|44->42|44->42|46->42|47->43|51->47|51->47|51->47|52->48|52->48|53->49|54->55|54->55|57->3|59->5|59->5|59->5|59->5|60->6|62->8|62->8|68->14|68->14|69->15|72->18|72->18|73->19|76->22|76->22|77->23|79->25|80->28|81->40|83->50|85->54
                  -- GENERATED --
              */
          