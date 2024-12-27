package com.yanghua_p.nai_long.generator.modlanguage;

import com.yanghua_p.nai_long.registery.item.ModItem;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LanguageENUS extends LanguageProvider
{
    public LanguageENUS(PackOutput output) {
        super(output, "nai_long","en_us");
    }
    @Override
    protected void addTranslations() {
        this.add(ModItem.NAI_LONG_ITEM.get(), "Nai Long");

    }
}
