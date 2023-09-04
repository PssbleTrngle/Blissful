package galena.blissful;

import galena.blissful.index.BlissfuItems;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.ItemLike;

import java.util.function.BiConsumer;

public class BlissfulClient {

    private static final ItemColor POTION_COLORS = (stack, i) -> {
        if(i != 1) return -1;
        return PotionUtils.getColor(stack);
    };

    public static void registerItemColors(BiConsumer<ItemColor, ItemLike> consumer) {
        consumer.accept(POTION_COLORS, BlissfuItems.POTION_BONG.get());
    }

}