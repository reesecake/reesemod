package com.reesecake.reesemod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.IParticleData;

public class ReeseTorch extends Block {
    public ReeseTorch() {
        super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).doesNotBlockMovement()
        );
    }
}
