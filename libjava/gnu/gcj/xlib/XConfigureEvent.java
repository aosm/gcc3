/* Copyright (C) 2000  Free Software Foundation

   This file is part of libgcj.

This software is copyrighted work licensed under the terms of the
Libgcj License.  Please consult the file "LIBGCJ_LICENSE" for
details.  */

package gnu.gcj.xlib;

import java.awt.Rectangle;

/**
 * Interprets and retrieves data from an Xlib XConfigureEvent.
 *
 * @author Rolf W. Rasmussen <rolfwr@ii.uib.no>
 */
public class XConfigureEvent extends XEvent
{
  public XConfigureEvent(XAnyEvent event)
  {
    super(event);
    // FIXME: Avoid double checking?
    if (event.getType() != XAnyEvent.TYPE_CONFIGURE_NOTIFY)
      throw new IllegalArgumentException("Wrong event type");
  }
  
  public native Rectangle getBounds();
}



