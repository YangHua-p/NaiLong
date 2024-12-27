package com.yanghua_p.nai_long;
import com.yanghua_p.nai_long.generator.modlanguage.LanguageENUS;
import com.yanghua_p.nai_long.generator.modlanguage.LanguageZHCN;
import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;


public class ModDataGeneratorHandler
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        ExistingFileHelper efh = event.getExistingFileHelper();

        // 语言文件
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<LanguageENUS>) output -> new LanguageENUS(output)
        );
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<LanguageZHCN>) output -> new LanguageZHCN(output)
        );
    }
}
