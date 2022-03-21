package net.logandark.multiversion

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Suppress("unused")
object MultiVersionCommon : ModInitializer {
	private val logger: Logger = LoggerFactory.getLogger(MultiVersionCommon.javaClass)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}
