package java.awt;

import java.awt.Polygon;
import java.awt.Rectangle;

import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Caches certain Shape objects for reuse in AbstractGraphics2D. This avoids
 * massive creation of such objects.
 */
class ShapeCache
{

  /**
   * A cached Line2D.
   */
  public Line2D line;

  /**
   * A cached Rectangle.
   */
  public Rectangle rect;

  /**
   * A cached RoundRectangle2D.
   */
  public RoundRectangle2D roundRect;

  /**
   * A cached Ellipse2D.
   */
  public Ellipse2D ellipse;

  /**
   * A cached Arc2D.
   */
  public Arc2D arc;

  /**
   * A cached Polygon.
   */
  public Polygon polygon;

  /**
   * A cached polyline.
   */
  public GeneralPath polyline;
}
