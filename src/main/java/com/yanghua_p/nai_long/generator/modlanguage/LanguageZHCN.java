package com.yanghua_p.nai_long.generator.modlanguage;

import com.yanghua_p.nai_long.registery.item.ModItem;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LanguageZHCN extends LanguageProvider {
    public LanguageZHCN(PackOutput output) {
            super(output, "nai_long","zh_cn");
        }

    @Override
    protected void addTranslations() {
        this.add(ModItem.NAI_LONG_ITEM.get(), "奶龙");

    }
}
