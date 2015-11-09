# MaterialPercentDrawer

Uses
----

Generally percent layouts can be a efficient way to utilising the screens of different resolutions percent wise in Android. It can be a better approach for using LinearLayout which is specified by weight.

<a href="http://imgur.com/EDoT3iR"><img src="http://i.imgur.com/EDoT3iR.gif" title="source: imgur.com" /></a>

How to use?
-----------

To make use of Percent support for your applications. Add the below lines in build.gradle
```
compile 'com.android.support:percent:23.1.0'

```
**Note:** You have to use buildToolsVersion above 23.0.1 to make use of Percent support.

**To add width percent wise:**
```
app:layout_widthPercent="70%"
```
**To add height percent wise:**
```
app:layout_heightPercent="30%"
```
**To add margin percent wise:**
```
app:layout_marginPercent="10%"
```
**To add margin left percent wise:**
```
app:layout_marginLeftPercent="10%"
```
**To add margin right percent wise:**
```
app:layout_marginRightPercent="10%"
```
**To add margin top percent wise:**
```
app:layout_marginTopPercent="10%"
```
**To add margin bottom percent wise:**
```
app:layout_marginBottomPercent="10%"
```
