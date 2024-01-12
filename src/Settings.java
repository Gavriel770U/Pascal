enum Settings
{
    FRAME_WIDTH (800),
    FRAME_HEIGHT (600),
    GRAPHICS_WIDTH (800),
    GRAPHICS_HEIGHT (400),
    SETTINGS_WIDTH (800),
    SETTINGS_HEIGHT (200),
    PIXEL_SIZE (1);

    public final int ivalue;

    private Settings(int ivalue)
    {
        this.ivalue = ivalue;
    }
}