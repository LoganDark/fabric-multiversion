package net.logandark.multiversion

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Suppress("unused")
object MultiVersion : ModInitializer {
	private val logger: Logger = LoggerFactory.getLogger(MultiVersion.javaClass)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}
