package logger

import org.apache.logging.log4j.{LogManager, Logger}

/**
 * Created by prayagupd
 * on 9/17/16.
 */

object WarehouseSupplyChainLogger {
  val logger = LogManager.getLogger("suppliesLogger")

  def main (args: Array[String]){
    println(logger.isDebugEnabled)
    logger.debug("I'm Hunter Thomson and I'm alive.")
  }
}
