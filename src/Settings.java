public enum Settings
{
    FRAME_WIDTH (800),
    FRAME_HEIGHT (600),
    GRAPHICS_WIDTH (800),
    GRAPHICS_HEIGHT (700),
    SETTINGS_WIDTH (400),
    SETTINGS_HEIGHT (200),
    MOD_SLIDER_WIDTH (200),
    MOD_SLIDER_HEIGHT (200),
    MOD_SLIDER_MIN_MOD (1),
    MOD_SLIDER_MAX_MOD (100),
    MOD_SLIDER_INIT_MOD (2),
    MOD_SLIDER_MINOR_TICKS_SPACING (10),
    MOD_SLIDER_MAJOR_TICKS_SPACING (25),
    PIXEL_SIZE (1),
    RGB_VALUE_BOUND (256);

    public final int ivalue;

    private Settings(int ivalue)
    {
        this.ivalue = ivalue;
    }
}