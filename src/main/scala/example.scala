class SmallBoomAndRocketConfig extends Config(
	new WithTop ++
	new WithBootROM ++
	new freechips.rocketchip.subsystem.WithInclusiveCache ++
	new boom.common.WithRenumberHarts ++
	new boom.common.WithSmallBooms ++
	new boom.common.WithNBoomCores(1) ++
	new freechips.rocketchip.subsystem.WithNBigCores(1) ++
	new freechips.rocketchip.system.BaseConfig)