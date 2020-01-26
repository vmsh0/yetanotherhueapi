package io.github.zeroone3010.yahueapi.discovery;

import io.github.zeroone3010.yahueapi.HueBridge;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;

class HueBridgeDiscoveryServiceTestRun {
  private static final Logger logger = Logger.getLogger("HueBridgeDiscoveryServiceTestRun");

  /**
   * Runs the discovery service and prints the discovered bridges.
   *
   * @param args Not used.
   */
  public static void main(final String... args) throws InterruptedException, ExecutionException {
    final Future<List<HueBridge>> bridges = new HueBridgeDiscoveryService()
        .discoverBridges(bridge -> logger.info("Bridge found: " + bridge));
    System.out.println("Starting the discovery service discoverer");
    System.out.println("Bridges: " + bridges.get());
    System.out.println("Done.");
  }
}
