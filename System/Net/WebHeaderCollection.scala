package System.Net

import java.net._;
import java.io._;

class WebHeaderCollection(_req: HttpURLConnection) {

  def Add(name: String, value: String) = _req.setRequestProperty(name, value);
}